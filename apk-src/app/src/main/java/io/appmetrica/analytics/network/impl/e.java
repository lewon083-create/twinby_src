package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static byte[] a(int i, Function0 function0) {
        try {
            InputStream inputStream = (InputStream) function0.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i10 = 0;
                            while (true) {
                                int i11 = inputStream.read(bArr);
                                if (-1 == i11 || i10 > i) {
                                    break;
                                }
                                if (i11 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i11);
                                    i10 += i11;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStream.close();
                            return byteArray;
                        } finally {
                        }
                    } catch (Throwable unused) {
                        Unit unit = Unit.f27471a;
                        byteArrayOutputStream.close();
                        inputStream.close();
                        return new byte[0];
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
