package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Jd implements NativeCrashHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f22526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f22527b = C0382oa.k().w().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Md f22528c;

    public Jd(@NotNull Context context, @NotNull Rg rg, @NotNull Function1<? super String, Unit> function1, @NotNull Rd rd2, @NotNull EnumC0078cb enumC0078cb, @NotNull String str) {
        this.f22526a = function1;
        this.f22528c = new Md(context, rg, rd2, enumC0078cb);
    }

    public static final void a(Jd jd2, NativeCrash nativeCrash, File file) {
        jd2.f22526a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        G0 g02;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            H0 h0A = I0.a(nativeCrash.getMetadata());
            Intrinsics.b(h0A);
            g02 = new G0(source, handlerVersion, uuid, dumpFile, creationTime, h0A);
        } catch (Throwable unused) {
            g02 = null;
        }
        if (g02 == null) {
            this.f22526a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g02.f22368f.f22405a).info("Detected native crash with uuid = " + g02.f22365c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f22527b;
        Md md2 = this.f22528c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.ap
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Jd.a(this.f23463a, nativeCrash, (File) obj);
            }
        };
        md2.getClass();
        Fd fd2 = new Fd(new Hd(g02.f22363a, g02.f22364b), md2.f22686f);
        Cd cd2 = new Cd(md2.f22682b, g02.f22368f, new Ld(g02, md2.f22684d));
        C0051ba c0051ba = md2.f22685e;
        String str = g02.f22366d;
        c0051ba.getClass();
        File file = new File(str);
        Context context = md2.f22681a;
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
            iHandlerExecutor.execute(new Sf(file, fd2, consumer, cd2, c0025aa, md2.f22683c.a(g02)));
        } else {
            Intrinsics.g("INSTANCE");
            throw null;
        }
    }
}
