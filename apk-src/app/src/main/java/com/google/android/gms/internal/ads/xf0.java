package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf0 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ku f12145b;

    public /* synthetic */ xf0(ku kuVar, int i) {
        this.f12144a = i;
        this.f12145b = kuVar;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final /* synthetic */ ed.d a(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f12144a) {
            case 0:
                return vv.d(new pg0(inputStream, this.f12145b));
            case 1:
                return vv.d(new pg0(inputStream, this.f12145b));
            default:
                String str = new String(k61.a(inputStream), StandardCharsets.UTF_8);
                ku kuVar = this.f12145b;
                kuVar.f7305k = str;
                return vv.d(kuVar);
        }
    }
}
