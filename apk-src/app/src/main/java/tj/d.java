package tj;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f33921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f33924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f33924f = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    @Override // tj.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File a() {
        /*
            r11 = this;
            tj.g r0 = r11.f33924f
            tj.i r0 = r0.f33931c
            boolean r1 = r11.f33923e
            r2 = 0
            r3 = 1
            java.io.File r4 = r11.f33932a
            if (r1 != 0) goto L3e
            java.io.File[] r1 = r11.f33921c
            if (r1 != 0) goto L3e
            kotlin.jvm.functions.Function1 r1 = r0.f33935c
            if (r1 == 0) goto L21
            java.lang.Object r1 = r1.invoke(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L21
            goto L61
        L21:
            java.io.File[] r1 = r4.listFiles()
            r11.f33921c = r1
            if (r1 != 0) goto L3e
            kotlin.jvm.functions.Function2 r1 = r0.f33937e
            if (r1 == 0) goto L3c
            tj.a r5 = new tj.a
            r9 = 2
            r10 = 0
            java.io.File r6 = r11.f33932a
            r7 = 0
            java.lang.String r8 = "Cannot list files in a directory"
            r5.<init>(r6, r7, r8, r9, r10)
            r1.invoke(r4, r5)
        L3c:
            r11.f33923e = r3
        L3e:
            java.io.File[] r1 = r11.f33921c
            if (r1 == 0) goto L53
            int r5 = r11.f33922d
            int r6 = r1.length
            if (r5 >= r6) goto L53
            kotlin.jvm.internal.Intrinsics.b(r1)
            int r0 = r11.f33922d
            int r2 = r0 + 1
            r11.f33922d = r2
            r0 = r1[r0]
            return r0
        L53:
            boolean r1 = r11.f33920b
            if (r1 != 0) goto L5a
            r11.f33920b = r3
            return r4
        L5a:
            kotlin.jvm.functions.Function1 r0 = r0.f33936d
            if (r0 == 0) goto L61
            r0.invoke(r4)
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.d.a():java.io.File");
    }
}
