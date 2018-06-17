package se.learn.db.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.learn.db.project.entity.TableSpaceData;
import se.learn.db.project.repository.TableSpaceRepo;

import java.util.List;

@RestController
public class MonitoringController {

    @Autowired
    TableSpaceRepo tableSpaceRepo;

    @RequestMapping("/api/table-space-data")
    public List<TableSpaceData> findAll() {
        return (List<TableSpaceData>) tableSpaceRepo.findAll();
    }

}
