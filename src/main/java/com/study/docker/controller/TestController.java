package com.study.docker.controller;

import com.study.docker.dto.FileDto;
import com.study.docker.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "test";
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDto getFiles(@ModelAttribute FileDto file) {

        log.info(" @@@@@@@@@@@@@@@@@@@@@@@@ ");
        log.info(" @@@@@@@@@ TEST @@@@@@@@@ ");
        log.info(" @@@@@@@@@@@@@@@@@@@@@@@@ ");

        return new ResponseDto();
    }


}
