package r2;

import aj.i;
import android.content.Context;
import ij.h;
import ij.p;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s2.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f32178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f32179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f32180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f32182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f32183f;

    public c(Context context, String sharedPreferencesName, Set keysToMigrate, i shouldRunMigration, j migrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        f7.j jVar = new f7.j(1, context, sharedPreferencesName);
        this.f32178a = shouldRunMigration;
        this.f32179b = migrate;
        this.f32180c = context;
        this.f32181d = sharedPreferencesName;
        this.f32182e = h.b(jVar);
        this.f32183f = keysToMigrate == d.f32184a ? null : CollectionsKt.U(keysToMigrate);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, oj.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof r2.b
            if (r0 == 0) goto L13
            r0 = r6
            r2.b r0 = (r2.b) r0
            int r1 = r0.f32177o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32177o = r1
            goto L18
        L13:
            r2.b r0 = new r2.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f32175m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f32177o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            r2.c r5 = r0.f32174l
            com.google.android.gms.internal.measurement.h5.E(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.google.android.gms.internal.measurement.h5.E(r6)
            r0.f32174l = r4
            r0.f32177o = r3
            aj.i r6 = r4.f32178a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            java.util.LinkedHashSet r6 = r5.f32183f
            ij.p r5 = r5.f32182e
            r0 = 0
            if (r6 != 0) goto L6c
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6a
            goto L8f
        L6a:
            r3 = r0
            goto L8f
        L6c:
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L79
            goto L6a
        L79:
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L7d
        L8f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.c.a(java.lang.Object, oj.c):java.lang.Object");
    }
}
