package com.google.firebase.messaging;

import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements sb.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f14855c;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i) {
        this.f14854b = i;
        this.f14855c = firebaseMessaging;
    }

    @Override // sb.d
    public final void onSuccess(Object obj) {
        int i = this.f14854b;
        FirebaseMessaging firebaseMessaging = this.f14855c;
        switch (i) {
            case 0:
                e0 e0Var = (e0) obj;
                if (firebaseMessaging.f14769e.j()) {
                    e0Var.f();
                }
                break;
            default:
                la.a aVar = (la.a) obj;
                v7.f fVar = FirebaseMessaging.f14762l;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    d4.n(aVar.f28060b);
                    firebaseMessaging.g();
                }
                break;
        }
    }
}
