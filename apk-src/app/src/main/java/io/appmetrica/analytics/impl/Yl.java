package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yl extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f23356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f23358e;

    public Yl(@NonNull I3 i32) {
        this(i32.a().c(), i32.a().d(), i32.a().a(), i32.a().h(), i32.a().b());
    }

    public final boolean a(@NonNull Yl yl2) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Yl mergeFrom(@NonNull Yl yl2) {
        return new Yl((String) WrapUtils.getOrDefaultNullable(this.f23354a, yl2.f23354a), (String) WrapUtils.getOrDefaultNullable(this.f23355b, yl2.f23355b), (Map) WrapUtils.getOrDefaultNullable(this.f23356c, yl2.f23356c), this.f23357d || yl2.f23357d, yl2.f23357d ? yl2.f23358e : this.f23358e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Arguments{distributionReferrer='");
        sb2.append(this.f23354a);
        sb2.append("', installReferrerSource='");
        sb2.append(this.f23355b);
        sb2.append("', clientClids=");
        sb2.append(this.f23356c);
        sb2.append(", hasNewCustomHosts=");
        sb2.append(this.f23357d);
        sb2.append(", newCustomHosts=");
        return a0.u.p(sb2, this.f23358e, '}');
    }

    public Yl(String str, String str2, Map<String, String> map, boolean z5, List<String> list) {
        this.f23354a = str;
        this.f23355b = str2;
        this.f23356c = map;
        this.f23357d = z5;
        this.f23358e = list;
    }

    public Yl() {
        this(null, null, null, false, null);
    }
}
