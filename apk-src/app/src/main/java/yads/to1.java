package yads;

import android.content.Context;
import io.sentry.clientreport.DiscardedEvent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class to1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo1 f43389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js1 f43390b;

    public /* synthetic */ to1(zo1 zo1Var) {
        this(zo1Var, new js1());
    }

    public final com.monetization.ads.mediation.base.a a(Context context, sq1 sq1Var, Class cls) {
        String str;
        String str2;
        try {
            str = sq1Var.f43050b;
            this.f43390b.getClass();
        } catch (ClassCastException e3) {
            a(context, sq1Var, "does_not_conform_to_protocol", e3);
        } catch (Throwable th2) {
            a(context, sq1Var, "could_not_create_adapter", th2);
        }
        if (js1.f39967a.contains(str)) {
            if (qr0.a(context, pr0.f41997d)) {
            }
            return null;
        }
        Object objA = qm2.a(str, new Object[0]);
        if (cls.cast(objA) != null) {
            throw new ClassCastException();
        }
        if (objA == null) {
            str2 = String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        } else {
            str2 = String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{objA.getClass().getName(), cls.getName()}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        a(context, sq1Var, str2);
        return null;
    }

    public to1(zo1 zo1Var, js1 js1Var) {
        this.f43389a = zo1Var;
        this.f43390b = js1Var;
    }

    public final void a(Context context, sq1 sq1Var, String str) {
        Map mapG = kotlin.collections.j0.g(new Pair(DiscardedEvent.JsonKeys.REASON, "could_not_create_adapter"), new Pair("description", str));
        zo1 zo1Var = this.f43389a;
        zo1Var.getClass();
        zo1Var.a(context, eo2.f38197f, sq1Var, null, mapG);
    }

    public final void a(Context context, sq1 sq1Var, String str, Throwable th2) {
        LinkedHashMap linkedHashMapH = kotlin.collections.j0.h(new Pair(DiscardedEvent.JsonKeys.REASON, str));
        String message = th2.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        linkedHashMapH.put("description", th2.getClass().getName() + " " + message);
        this.f43389a.a(context, sq1Var, linkedHashMapH);
    }
}
