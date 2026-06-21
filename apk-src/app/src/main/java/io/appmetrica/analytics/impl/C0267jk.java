package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0267jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0241ik f24178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f24179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f24180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile A9 f24181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile A9 f24182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile A9 f24183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile A9 f24184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ExecutorC0216hk f24185h;

    public C0267jk() {
        this(new C0241ik());
    }

    public final IHandlerExecutor a() {
        if (this.f24184g == null) {
            synchronized (this) {
                try {
                    if (this.f24184g == null) {
                        this.f24178a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-SDE");
                        this.f24184g = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f24184g;
    }

    public final IHandlerExecutor b() {
        if (this.f24181d == null) {
            synchronized (this) {
                try {
                    if (this.f24181d == null) {
                        this.f24178a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-SMH-1");
                        this.f24181d = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f24181d;
    }

    public final IHandlerExecutor c() {
        if (this.f24182e == null) {
            synchronized (this) {
                try {
                    if (this.f24182e == null) {
                        this.f24178a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-SNTPE");
                        this.f24182e = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f24182e;
    }

    public final IHandlerExecutor d() {
        if (this.f24180c == null) {
            synchronized (this) {
                try {
                    if (this.f24180c == null) {
                        this.f24178a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-STE");
                        this.f24180c = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f24180c;
    }

    public C0267jk(C0241ik c0241ik) {
        new HashMap();
        this.f24178a = c0241ik;
    }
}
