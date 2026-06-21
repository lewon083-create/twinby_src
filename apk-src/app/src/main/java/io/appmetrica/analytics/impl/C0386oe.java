package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0386oe implements InterfaceC0075c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0485se f24515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0275k3 f24516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0506ta f24517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final If f24518d;

    public C0386oe() {
        this(new C0485se(), new C0275k3(), new C0506ta(100), new If());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ci> fromModel(@NonNull C0361ne c0361ne) {
        Ci ciFromModel;
        C0554v8 c0554v8 = new C0554v8();
        c0554v8.f24886a = c0361ne.f24435a;
        c0554v8.f24891f = new C0280k8();
        C0411pe c0411pe = c0361ne.f24436b;
        C0230i8 c0230i8 = new C0230i8();
        c0230i8.f24054a = StringUtils.getUTF8Bytes(c0411pe.f24577a);
        Ln lnA = this.f24517c.a(c0411pe.f24578b);
        c0230i8.f24055b = StringUtils.getUTF8Bytes((String) lnA.f22635a);
        c0230i8.f24058e = c0411pe.f24579c.size();
        Map<String, String> map = c0411pe.f24580d;
        if (map != null) {
            ciFromModel = this.f24515a.fromModel(map);
            c0230i8.f24056c = (C0330m8) ciFromModel.f22216a;
        } else {
            ciFromModel = null;
        }
        c0554v8.f24891f.f24210a = c0230i8;
        int i = 0;
        char c8 = 1;
        C0044b3 c0044b3 = new C0044b3(C0044b3.b(lnA, ciFromModel));
        List list = c0411pe.f24579c;
        ArrayList arrayList = new ArrayList();
        this.f24518d.getClass();
        int iComputeInt32Size = c0554v8.f24886a != new C0554v8().f24886a ? CodedOutputByteBufferNano.computeInt32Size(1, c0554v8.f24886a) : 0;
        C0529u8 c0529u8 = c0554v8.f24887b;
        if (c0529u8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c0529u8);
        }
        C0479s8 c0479s8 = c0554v8.f24888c;
        if (c0479s8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0479s8);
        }
        C0504t8 c0504t8 = c0554v8.f24889d;
        int i10 = 4;
        if (c0504t8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c0504t8);
        }
        C0126e8 c0126e8 = c0554v8.f24890e;
        if (c0126e8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0126e8);
        }
        C0280k8 c0280k8 = c0554v8.f24891f;
        if (c0280k8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0280k8);
        }
        ArrayList arrayList2 = new ArrayList();
        C0554v8 c0554v82 = new C0554v8();
        c0554v82.f24886a = c0554v8.f24886a;
        C0280k8 c0280k82 = new C0280k8();
        c0554v82.f24891f = c0280k82;
        c0280k82.f24210a = new C0230i8();
        C0230i8 c0230i82 = c0554v82.f24891f.f24210a;
        C0230i8 c0230i83 = c0554v8.f24891f.f24210a;
        c0230i82.f24055b = c0230i83.f24055b;
        c0230i82.f24054a = c0230i83.f24054a;
        c0230i82.f24058e = c0230i83.f24058e;
        c0230i82.f24056c = c0230i83.f24056c;
        C0044b3 c0044b32 = c0044b3;
        int i11 = 0;
        int i12 = iComputeInt32Size;
        while (i11 < list.size()) {
            C0300l3 c0300l3 = (C0300l3) list.get(i11);
            char c9 = c8;
            C0255j8 c0255j8 = new C0255j8();
            c0255j8.f24141a = i11;
            int i13 = i;
            Ci ciFromModel2 = this.f24516b.fromModel(c0300l3);
            c0255j8.f24142b = (C0152f8) ciFromModel2.f22216a;
            ciFromModel2.f22217b.getBytesTruncated();
            Ci ci2 = new Ci(c0255j8, ciFromModel2);
            If r42 = this.f24518d;
            C0255j8 c0255j82 = (C0255j8) ci2.f22216a;
            r42.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i10);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0255j82);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? i13 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i12 + iComputeRawVarint32Size > 204800) {
                c0554v82.f24891f.f24210a.f24057d = (C0255j8[]) arrayList2.toArray(new C0255j8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ci(c0554v82, c0044b32));
                C0554v8 c0554v83 = new C0554v8();
                c0554v83.f24886a = c0554v8.f24886a;
                C0280k8 c0280k83 = new C0280k8();
                c0554v83.f24891f = c0280k83;
                c0280k83.f24210a = new C0230i8();
                C0230i8 c0230i84 = c0554v83.f24891f.f24210a;
                C0230i8 c0230i85 = c0554v8.f24891f.f24210a;
                c0230i84.f24055b = c0230i85.f24055b;
                c0230i84.f24054a = c0230i85.f24054a;
                c0230i84.f24058e = c0230i85.f24058e;
                c0230i84.f24056c = c0230i85.f24056c;
                c0044b32 = c0044b3;
                i12 = iComputeInt32Size;
                c0554v82 = c0554v83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0255j8) ci2.f22216a);
            InterfaceC0070c3 interfaceC0070c3 = ci2.f22217b;
            InterfaceC0070c3[] interfaceC0070c3Arr = new InterfaceC0070c3[2];
            interfaceC0070c3Arr[i13] = c0044b32;
            interfaceC0070c3Arr[c9] = interfaceC0070c3;
            c0044b32 = new C0044b3(C0044b3.b(interfaceC0070c3Arr));
            i12 += iComputeRawVarint32Size;
            i11++;
            c8 = c9;
            i = i13;
            i10 = 4;
        }
        c0554v82.f24891f.f24210a.f24057d = (C0255j8[]) arrayList2.toArray(new C0255j8[arrayList2.size()]);
        arrayList.add(new Ci(c0554v82, c0044b32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0386oe(C0485se c0485se, C0275k3 c0275k3, C0506ta c0506ta, If r42) {
        this.f24515a = c0485se;
        this.f24516b = c0275k3;
        this.f24517c = c0506ta;
        this.f24518d = r42;
    }

    @NonNull
    public final C0361ne a(@NonNull List<Ci> list) {
        throw new UnsupportedOperationException();
    }
}
