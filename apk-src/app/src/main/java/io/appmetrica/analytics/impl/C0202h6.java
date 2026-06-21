package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0202h6 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f23962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tg f23963b;

    public C0202h6(@NotNull Context context, @NotNull InterfaceC0124e6 interfaceC0124e6, @NotNull EnumC0078cb enumC0078cb, @NotNull Zk zk2, @NotNull Executor executor, @NotNull String str) {
        this.f23962a = executor;
        this.f23963b = new Tg(context, interfaceC0124e6, enumC0078cb, zk2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f23962a;
        Tg tg = this.f23963b;
        C0383ob c0383ob = tg.f23025c;
        Consumer consumer = tg.f23027e;
        Context context = tg.f23023a;
        if (C0025aa.f23424c == null) {
            synchronized (kotlin.jvm.internal.g0.a(C0025aa.class)) {
                try {
                    if (C0025aa.f23424c == null) {
                        C0025aa.f23424c = new C0025aa(context);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C0025aa c0025aa = C0025aa.f23424c;
        if (c0025aa != null) {
            executor.execute(new Sf(file, c0383ob, c0383ob, consumer, c0025aa, tg.f23024b));
        } else {
            Intrinsics.g("INSTANCE");
            throw null;
        }
    }
}
