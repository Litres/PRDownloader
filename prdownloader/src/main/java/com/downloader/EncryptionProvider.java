package com.downloader;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by d.trandin on 19.02.2018.
 */

public interface EncryptionProvider {
    OutputStream encrypt(OutputStream outputStream) throws IOException;
}
