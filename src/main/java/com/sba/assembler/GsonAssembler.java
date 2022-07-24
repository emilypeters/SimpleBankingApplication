package com.sba.assembler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sba.dto.AccountDto;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class GsonAssembler {

    public GsonAssembler() {}

    public List<AccountDto> assembleJsonToAccountDto(String jsonFile) throws IOException {
        String json = new String(Files.readAllBytes(Paths.get(jsonFile)));
        Gson gson = new Gson();
        Type accountListType = new TypeToken<ArrayList<AccountDto>>(){}.getType();
        ArrayList<AccountDto> accountArray = gson.fromJson(json, accountListType);
        return accountArray;
    }
}
