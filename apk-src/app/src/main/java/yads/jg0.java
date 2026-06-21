package yads;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f39864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah1 f39865b;

    public /* synthetic */ jg0() {
        this(new lg0(), new ah1());
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public final String a(Context context) {
        String lowerCase = this.f39864a.a(context).name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public jg0(lg0 lg0Var, ah1 ah1Var) {
        this.f39864a = lg0Var;
        this.f39865b = ah1Var;
    }
}
