package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0439qh implements InterfaceC0395on {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0281k9 f24636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0513th f24637b;

    public C0439qh(C0513th c0513th, C0281k9 c0281k9) {
        this.f24637b = c0513th;
        this.f24636a = c0281k9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0395on
    public final void a(Object obj) {
        List list = (List) obj;
        C0281k9 c0281k9 = this.f24636a;
        if (ko.a((Collection) list)) {
            return;
        }
        c0281k9.f24217d = new C0231i9[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C0217hl c0217hl = (C0217hl) list.get(i);
            C0231i9[] c0231i9Arr = c0281k9.f24217d;
            Map map = Of.f22801a;
            C0231i9 c0231i9 = new C0231i9();
            Integer num = c0217hl.f23995a;
            if (num != null) {
                c0231i9.f24060a = num.intValue();
            }
            Integer num2 = c0217hl.f23996b;
            if (num2 != null) {
                c0231i9.f24061b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0217hl.f23998d)) {
                c0231i9.f24062c = c0217hl.f23998d;
            }
            c0231i9.f24063d = c0217hl.f23997c;
            c0231i9Arr[i] = c0231i9;
            this.f24637b.f24794g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0281k9.f24217d[i]);
            this.f24637b.f24794g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
