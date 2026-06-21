package com.google.android.gms.auth;

import android.content.Intent;
import c7.k;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class UserRecoverableAuthException extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f2586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2587c;

    public UserRecoverableAuthException(int i, Intent intent, String str) {
        super(str);
        this.f2586b = intent;
        o.n(i);
        this.f2587c = i;
    }
}
