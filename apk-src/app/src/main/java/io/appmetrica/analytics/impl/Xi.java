package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Xi implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0485se f23255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0325m3 f23256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0506ta f23257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0506ta f23258d;

    public Xi() {
        this(new C0485se(), new C0325m3(), new C0506ta(100), new C0506ta(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull C0060bj c0060bj) {
        Ci ciA;
        C0454r8 c0454r8 = new C0454r8();
        Ln lnA = this.f23257c.a(c0060bj.f23509a);
        c0454r8.f24681a = StringUtils.getUTF8Bytes((String) lnA.f22635a);
        List<String> list = c0060bj.f23510b;
        Ci ciA2 = null;
        if (list != null) {
            ciA = this.f23256b.fromModel(list);
            c0454r8.f24682b = (C0178g8) ciA.f22216a;
        } else {
            ciA = null;
        }
        Ln lnA2 = this.f23258d.a(c0060bj.f23511c);
        c0454r8.f24683c = StringUtils.getUTF8Bytes((String) lnA2.f22635a);
        Map<String, String> map = c0060bj.f23512d;
        if (map != null) {
            ciA2 = this.f23255a.fromModel(map);
            c0454r8.f24684d = (C0330m8) ciA2.f22216a;
        }
        return new Ci(c0454r8, new C0044b3(C0044b3.b(lnA, ciA, lnA2, ciA2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Xi(C0485se c0485se, C0325m3 c0325m3, C0506ta c0506ta, C0506ta c0506ta2) {
        this.f23255a = c0485se;
        this.f23256b = c0325m3;
        this.f23257c = c0506ta;
        this.f23258d = c0506ta2;
    }

    @NonNull
    public final C0060bj a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
