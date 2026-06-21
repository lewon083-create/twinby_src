package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0477s6 implements Bf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0452r6 f24728b = new C0452r6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bf f24729a;

    public C0477s6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Bf
    @Nullable
    public final String a() {
        return this.f24729a.a();
    }

    public final boolean b() {
        try {
            String strA = this.f24729a.a();
            if (strA != null && strA.length() > 0) {
                return !StringsKt.y(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C0477s6(@NotNull Bf bf2) {
        this.f24729a = bf2;
    }

    public final boolean a(@NotNull String str) {
        try {
            String strA = this.f24729a.a();
            if (strA == null || strA.length() <= 0) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(str);
            return kotlin.text.a0.h(strA, sb2.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0477s6(Bf bf2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            f24728b.getClass();
            bf2 = C0452r6.a();
        }
        this(bf2);
    }
}
