package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Fd implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hd f22330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ed f22331b;

    public Fd(@NotNull Hd hd2, @NotNull Ed ed2) {
        this.f22330a = hd2;
        this.f22331b = ed2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String apply(@NotNull File file) {
        byte[] bArrW;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                    try {
                        bArrW = hl.d.w(fileInputStream);
                        ko.a((Closeable) fileInputStream);
                    } catch (Throwable unused) {
                        ko.a((Closeable) fileInputStream);
                        bArrW = null;
                    }
                } catch (Throwable unused2) {
                    fileInputStream = null;
                }
            } else {
                bArrW = null;
            }
            if (bArrW == null) {
                return null;
            }
            if (bArrW.length == 0) {
                bArrW = null;
            }
            if (bArrW != null) {
                return Base64Utils.compressBase64(MessageNano.toByteArray(this.f22331b.fromModel(new Kd(bArrW, this.f22330a))));
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
