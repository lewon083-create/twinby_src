package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f4315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f4316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f4318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lu0 f4319g;

    public cu0(Handler handler, Context context, lu0 lu0Var) {
        super(handler);
        this.f4316d = new AtomicReference(Float.valueOf(-1.0f));
        this.f4317e = new AtomicBoolean(false);
        this.f4318f = Executors.newSingleThreadExecutor();
        this.f4313a = handler;
        this.f4314b = context;
        this.f4315c = (AudioManager) context.getSystemService("audio");
        this.f4319g = lu0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        if (this.f4317e.getAndSet(true)) {
            return;
        }
        this.f4318f.submit(new kr0(1, this));
    }
}
