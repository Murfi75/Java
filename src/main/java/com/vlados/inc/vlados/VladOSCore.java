package com.vlados.inc.vlados;

import java.io.*;
import java.util.*;

public class VladOSCore {

    private final File storageDir = new File("vladOS_storage");

    public VladOSCore() {
        if (!storageDir.exists()) {
            storageDir.mkdir();
            System.out.println("🛠️ Система инициализирована.");
        }
    }
}
