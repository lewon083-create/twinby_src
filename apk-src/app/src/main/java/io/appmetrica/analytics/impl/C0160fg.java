package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0160fg implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xi f23880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0506ta f23881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0506ta f23882c;

    public C0160fg() {
        this(new Xi(), new C0506ta(100), new C0506ta(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ci fromModel(@NonNull C0587wg c0587wg) {
        Ci ciFromModel;
        C0430q8 c0430q8 = new C0430q8();
        Ln lnA = this.f23881b.a(c0587wg.f24979a);
        c0430q8.f24622a = StringUtils.getUTF8Bytes((String) lnA.f22635a);
        Ln lnA2 = this.f23882c.a(c0587wg.f24980b);
        c0430q8.f24623b = StringUtils.getUTF8Bytes((String) lnA2.f22635a);
        C0060bj c0060bj = c0587wg.f24981c;
        if (c0060bj != null) {
            ciFromModel = this.f23880a.fromModel(c0060bj);
            c0430q8.f24624c = (C0454r8) ciFromModel.f22216a;
        } else {
            ciFromModel = null;
        }
        return new Ci(c0430q8, new C0044b3(C0044b3.b(lnA, lnA2, ciFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0160fg(Xi xi2, C0506ta c0506ta, C0506ta c0506ta2) {
        this.f23880a = xi2;
        this.f23881b = c0506ta;
        this.f23882c = c0506ta2;
    }

    @NonNull
    public final C0587wg a(@NonNull Ci ci2) {
        throw new UnsupportedOperationException();
    }
}
