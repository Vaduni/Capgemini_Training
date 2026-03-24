package com.gal.api;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import java.util.Arrays;
import java.util.List;

import com.gal.model.Issue;
import com.gal.service.IssueService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(IssueController.class)
public class IssueControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockitoBean 
    private IssueService issueService;
    @Test
    void testGetUnresolved() throws Exception {

        Issue issue = new Issue();
        issue.setIssueId(1);
        issue.setStatus("UNRESOLVED");

        List<Issue> issues = Arrays.asList(issue);

        when(issueService.getUnresolved(1)).thenReturn(issues);

        mockMvc.perform(get("/issue/unresolved/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].issueId").value(1))
                .andExpect(jsonPath("$[0].status").value("UNRESOLVED"));
    }
    @Test
    void testGetThisMonth() throws Exception {

        Issue issue = new Issue();
        issue.setIssueId(2);

        when(issueService.getIssuesOfThisMonth()).thenReturn(List.of(issue));

        mockMvc.perform(get("/issue/thismonth"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].issueId").value(2));
    }
    @Test
    void testGetEmployees() throws Exception {

        when(issueService.getEmployeeNamesThisMonth())
                .thenReturn(List.of("Vaduni", "Bhavya"));

        mockMvc.perform(get("/issue/employees/3"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("Vaduni"))
                .andExpect(jsonPath("$[1]").value("Bhavya"));
    }
}