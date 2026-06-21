package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ip1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static MessageDigest f6567c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6568b;

    public ip1(int i) {
        switch (i) {
            case 5:
                this.f6568b = new nh();
                break;
            default:
                this.f6568b = new Object();
                break;
        }
    }

    public synchronized void A1(e80 e80Var) {
        for (Map.Entry entry : ((HashMap) this.f6568b).entrySet()) {
            ((Executor) entry.getValue()).execute(new l81(19, e80Var, entry.getKey()));
        }
    }

    public abstract long B1();

    public abstract long C1();

    public abstract boolean D1();

    public abstract int E1();

    public abstract long O();

    public abstract void P(Object obj, long j10, byte b2);

    public MessageDigest Q() {
        synchronized (this.f6568b) {
            MessageDigest messageDigest = f6567c;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f6567c = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f6567c;
        }
    }

    public abstract boolean T(long j10, Object obj);

    public abstract void V(int i, long j10);

    public abstract void W(Object obj, long j10, boolean z5);

    public abstract float X(long j10, Object obj);

    public abstract void Y(Object obj, long j10, float f10);

    public abstract double Z(long j10, Object obj);

    public abstract void a0(Object obj, long j10, double d10);

    public abstract byte b0(long j10);

    public abstract int c0();

    public abstract int d0();

    public abstract void e();

    public abstract boolean e0();

    public abstract void f0();

    public abstract no h0();

    public abstract int t();

    public abstract ci v1();

    public synchronized void x1(Object obj, Executor executor) {
        ((HashMap) this.f6568b).put(obj, executor);
    }

    public abstract int y1();

    public abstract int z1();

    public ip1(View view) {
        this.f6568b = new WeakReference(view);
    }

    public ip1(Set set) {
        this.f6568b = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                s80 s80Var = (s80) it.next();
                synchronized (this) {
                    x1(s80Var.f10201a, s80Var.f10202b);
                }
            }
        }
    }
}
