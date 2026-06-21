package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0135eh extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23776h;
    public final Map<String, String> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23777j;

    public C0135eh(@NonNull C0401p4 c0401p4) {
        this(c0401p4.f24547a, c0401p4.f24548b, c0401p4.f24550d, c0401p4.f24551e, c0401p4.f24552f, c0401p4.f24553g, c0401p4.f24554h, c0401p4.i, c0401p4.f24555j, c0401p4.f24556k);
    }

    public static C0135eh a() {
        return new C0135eh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0135eh mergeFrom(@NonNull C0401p4 c0401p4) {
        return new C0135eh((String) WrapUtils.getOrDefaultNullable(c0401p4.f24547a, this.f23769a), (Boolean) WrapUtils.getOrDefaultNullable(c0401p4.f24548b, Boolean.valueOf(this.f23770b)), (Boolean) WrapUtils.getOrDefaultNullable(c0401p4.f24550d, Boolean.valueOf(this.f23771c)), (Integer) WrapUtils.getOrDefaultNullable(c0401p4.f24551e, Integer.valueOf(this.f23772d)), (Integer) WrapUtils.getOrDefaultNullable(c0401p4.f24552f, Integer.valueOf(this.f23773e)), (Integer) WrapUtils.getOrDefaultNullable(c0401p4.f24553g, Integer.valueOf(this.f23774f)), (Boolean) WrapUtils.getOrDefaultNullable(c0401p4.f24554h, Boolean.valueOf(this.f23775g)), (Boolean) WrapUtils.getOrDefaultNullable(c0401p4.i, Boolean.valueOf(this.f23776h)), (Map) WrapUtils.getOrDefaultNullable(c0401p4.f24555j, this.i), (Integer) WrapUtils.getOrDefaultNullable(c0401p4.f24556k, Integer.valueOf(this.f23777j)));
    }

    public C0135eh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f23769a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f23770b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f23771c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f23772d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f23773e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f23774f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f23775g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f23776h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.i = map;
        this.f23777j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NonNull C0401p4 c0401p4) {
        Map<String, String> map;
        String str;
        Boolean bool = c0401p4.f24548b;
        if (bool != null && this.f23770b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0401p4.f24550d;
        if (bool2 != null && this.f23771c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0401p4.f24551e;
        if (num != null && this.f23772d != num.intValue()) {
            return false;
        }
        Integer num2 = c0401p4.f24552f;
        if (num2 != null && this.f23773e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0401p4.f24553g;
        if (num3 != null && this.f23774f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0401p4.f24554h;
        if (bool3 != null && this.f23775g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0401p4.i;
        if (bool4 != null && this.f23776h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0401p4.f24547a;
        if (str2 != null && ((str = this.f23769a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0401p4.f24555j;
        if (map2 != null && ((map = this.i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0401p4.f24556k;
        return num4 == null || this.f23777j == num4.intValue();
    }
}
