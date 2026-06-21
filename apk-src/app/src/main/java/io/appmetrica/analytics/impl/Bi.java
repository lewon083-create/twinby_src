package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f22154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22156c;

    public Bi(Context context, String str, String str2) {
        this.f22154a = context;
        this.f22155b = str;
        this.f22156c = str2;
    }

    public final Object a() {
        int identifier = this.f22154a.getResources().getIdentifier(this.f22155b, this.f22156c, this.f22154a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i);
}
