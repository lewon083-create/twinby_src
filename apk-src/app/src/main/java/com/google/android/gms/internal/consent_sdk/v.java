package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f13592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f13593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f13594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f13595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f13596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f13597g;

    /* JADX INFO: Fake field, exist only in values array */
    v EF0;

    static {
        v vVar = new v("DEBUG_PARAM_UNKNOWN", 0);
        v vVar2 = new v("ALWAYS_SHOW", 1);
        v vVar3 = new v("GEO_OVERRIDE_EEA", 2);
        f13592b = vVar3;
        v vVar4 = new v("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        f13593c = vVar4;
        v vVar5 = new v("GEO_OVERRIDE_OTHER", 4);
        f13594d = vVar5;
        v vVar6 = new v("GEO_OVERRIDE_NON_EEA", 5);
        f13595e = vVar6;
        v vVar7 = new v("PREVIEWING_DEBUG_MESSAGES", 6);
        f13596f = vVar7;
        f13597g = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, new v("GEO_OVERRIDE_USFL", 7)};
    }

    public static v[] values() {
        return (v[]) f13597g.clone();
    }
}
