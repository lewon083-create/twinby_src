package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0653z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ja f25110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25111b = "";

    public C0653z7(Ja ja2) {
        this.f25110a = ja2;
    }

    public final void a(String str, boolean z5) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || Intrinsics.a(this.f25111b, str)) {
                return;
            }
            this.f25111b = str;
            this.f25110a.a(str, z5);
        }
    }
}
