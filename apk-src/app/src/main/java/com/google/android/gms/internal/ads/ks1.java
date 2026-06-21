package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ks1 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7291a;

    public ks1(LinkedHashMap linkedHashMap) {
        this.f7291a = Collections.unmodifiableMap(linkedHashMap);
    }
}
