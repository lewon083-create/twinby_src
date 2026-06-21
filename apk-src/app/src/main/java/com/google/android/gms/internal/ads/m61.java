package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m61 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f7792b = new ArrayDeque(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f7793c;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th2 = this.f7793c;
        while (true) {
            ArrayDeque arrayDeque = this.f7792b;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else if (th2 != th3) {
                    try {
                        th2.addSuppressed(th3);
                    } catch (Throwable unused) {
                        l61.f7408a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th3);
                    }
                }
            }
        }
        if (this.f7793c != null || th2 == null) {
            return;
        }
        Object obj = r31.f9693a;
        if (IOException.class.isInstance(th2)) {
            throw ((Throwable) IOException.class.cast(th2));
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new AssertionError(th2);
        }
        throw ((Error) th2);
    }
}
