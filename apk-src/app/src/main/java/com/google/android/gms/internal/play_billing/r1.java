package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r1 f14293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r1[] f14294c;

    static {
        r1 r1Var = new r1("INSTANCE", 0);
        f14293b = r1Var;
        f14294c = new r1[]{r1Var};
    }

    public static r1[] values() {
        return (r1[]) f14294c.clone();
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
