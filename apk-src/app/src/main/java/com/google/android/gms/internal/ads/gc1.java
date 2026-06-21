package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f5779a = Logger.getLogger(gc1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f5780b = new AtomicBoolean(false);

    public static boolean a() {
        return f5780b.get();
    }
}
