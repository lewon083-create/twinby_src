package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Tf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f23022b;

    public Tf(File file, C0202h6 c0202h6) {
        this.f23021a = file;
        this.f23022b = c0202h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (!this.f23021a.exists() || !this.f23021a.isDirectory() || (fileArrListFiles = this.f23021a.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                this.f23022b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
