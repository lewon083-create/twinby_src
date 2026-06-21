package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0080cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f23608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0517tl f23609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f23611d;

    public C0080cd(IHandlerExecutor iHandlerExecutor, AbstractC0634yd abstractC0634yd, String str, SystemTimeProvider systemTimeProvider) {
        this.f23608a = iHandlerExecutor;
        this.f23609b = abstractC0634yd;
        this.f23610c = str;
        this.f23611d = systemTimeProvider;
    }

    public static final void a(C0080cd c0080cd, List list) {
        Pj pj2 = AbstractC0366nj.f24449a;
        C0131ed c0131ed = new C0131ed(c0080cd.f23609b, c0080cd.f23610c, c0080cd.f23611d, list);
        pj2.getClass();
        pj2.a(new Dj(c0131ed));
    }

    public final void a(ArrayList arrayList) {
        this.f23608a.execute(new cp(1, this, arrayList));
    }
}
