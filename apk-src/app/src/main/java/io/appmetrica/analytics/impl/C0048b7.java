package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0048b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f23493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23494b;

    public C0048b7(File file) {
        ArrayList arrayList = new ArrayList();
        this.f23494b = arrayList;
        if (file != null) {
            this.f23493a = new C0436qe(file, new O6());
            arrayList.add(new C0436qe(file, new C0261je()));
        } else {
            this.f23493a = new K6(new O6());
        }
        arrayList.add(new K6(new C0261je()));
    }
}
