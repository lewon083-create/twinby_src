package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f22690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162fi f22691b;

    public Mh(C0162fi c0162fi, UserProfile userProfile) {
        this.f22691b = c0162fi;
        this.f22690a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f22691b;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).reportUserProfile(this.f22690a);
    }
}
