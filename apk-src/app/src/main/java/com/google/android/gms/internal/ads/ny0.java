package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ny0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f8496a;

    public ny0(ExecutorService executorService) {
        this.f8496a = executorService;
    }

    public final my0 a(File file, byte[] bArr, Function function) {
        return new my0(file, this.f8496a, new hz(bArr), function);
    }
}
