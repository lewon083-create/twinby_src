package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mm extends Qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f22701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f22702c;

    public Mm(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f22700a = str;
        this.f22701b = protobufStateSerializer;
        this.f22702c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Qm
    public final IBinaryDataHelper a(Context context) {
        return C0382oa.I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.Qm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper iBinaryDataHelperA;
        C0616xk c0616xkB = C0382oa.I.B();
        synchronized (c0616xkB) {
            iBinaryDataHelperA = c0616xkB.a(context);
        }
        return iBinaryDataHelperA;
    }

    @Override // io.appmetrica.analytics.impl.Qm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        String str = this.f22700a;
        ProtobufStateSerializer protobufStateSerializer = this.f22701b;
        try {
            bArrA = AbstractC0163fj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC0163fj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new Lf(str, iBinaryDataHelper, new B8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), this.f22702c);
    }
}
