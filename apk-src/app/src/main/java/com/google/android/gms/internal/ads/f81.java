package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f81 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f81 f5272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f81[] f5273c;

    static {
        f81 f81Var = new f81("INSTANCE", 0);
        f5272b = f81Var;
        f5273c = new f81[]{f81Var};
    }

    public static f81[] values() {
        return (f81[]) f5273c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
