package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hz implements t81, ly0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6304b;

    public /* synthetic */ hz(byte[] bArr) {
        this.f6304b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ly0
    public /* synthetic */ void c(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.ly0
    public Object d(FileInputStream fileInputStream) {
        try {
            return k61.a(fileInputStream);
        } catch (IOException e3) {
            throw new jy0("Cannot read bytes.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.t81
    /* JADX INFO: renamed from: h */
    public /* synthetic */ g91 mo1h() {
        AtomicInteger atomicInteger = jz.f7008v;
        return new q51(this.f6304b);
    }

    @Override // com.google.android.gms.internal.ads.ly0
    public /* synthetic */ Object l() {
        return this.f6304b;
    }
}
