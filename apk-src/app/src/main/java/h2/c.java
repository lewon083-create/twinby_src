package h2;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f20348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f20349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f20350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f20351h;
    public static final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f20352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f20353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f20354l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f20357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f20358d;

    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    static {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.c.<clinit>():void");
    }

    public c(int i10) {
        this(null, i10, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f20355a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f20355a;
        Object obj3 = this.f20355a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f20355a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strD = f.d(this.f20356b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f20355a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strD);
        return sb2.toString();
    }

    public c(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public c(Object obj, int i10, String str, q qVar, Class cls) {
        this.f20356b = i10;
        this.f20358d = qVar;
        if (obj == null) {
            this.f20355a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
        } else {
            this.f20355a = obj;
        }
        this.f20357c = cls;
    }
}
