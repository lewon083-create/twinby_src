package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class my0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f8038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f8039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ly0 f8040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function f8041d;

    public my0(File file, ExecutorService executorService, ly0 ly0Var, Function function) {
        this.f8038a = file;
        this.f8039b = executorService;
        this.f8040c = ly0Var;
        this.f8041d = function;
    }

    public final c91 a(Object obj) {
        return vv.B(new je(10, this, obj), this.f8039b);
    }
}
