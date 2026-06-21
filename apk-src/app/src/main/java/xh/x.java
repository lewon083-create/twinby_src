package xh;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.f f36205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f36206c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f36207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l7.n f36208e;

    public x(ii.f fVar) {
        HashMap map = new HashMap();
        this.f36207d = map;
        this.f36208e = new l7.n(13);
        this.f36205b = fVar;
        ki.a aVar = b0.f36101a;
        a0 a0Var = new a0();
        a0Var.f36098a = false;
        a0 a0Var2 = new a0[]{a0Var}[0];
        a0Var2.getClass();
        map.put(4294967556L, a0Var2);
    }

    public final void a(u uVar, final ac.c cVar) {
        long j10;
        long j11;
        byte[] bytes = null;
        ii.e eVar = cVar == null ? null : new ii.e() { // from class: xh.v
            @Override // ii.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                cVar.h(boolValueOf.booleanValue());
            }
        };
        try {
            String str = uVar.f36198g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(uVar.f36192a);
            int i = uVar.f36193b;
            if (i == 1) {
                j10 = 0;
            } else if (i == 2) {
                j10 = 1;
            } else {
                if (i != 3) {
                    throw null;
                }
                j10 = 2;
            }
            byteBufferAllocateDirect.putLong(j10);
            byteBufferAllocateDirect.putLong(uVar.f36194c);
            byteBufferAllocateDirect.putLong(uVar.f36195d);
            byteBufferAllocateDirect.putLong(uVar.f36196e ? 1L : 0L);
            int i10 = uVar.f36197f;
            if (i10 == 1) {
                j11 = 0;
            } else if (i10 == 2) {
                j11 = 1;
            } else if (i10 == 3) {
                j11 = 2;
            } else if (i10 == 4) {
                j11 = 3;
            } else {
                if (i10 != 5) {
                    throw null;
                }
                j11 = 4;
            }
            byteBufferAllocateDirect.putLong(j11);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f36205b.g("flutter/keydata", byteBufferAllocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z5, Long l10, Long l11, long j10) {
        u uVar = new u();
        uVar.f36192a = j10;
        uVar.f36193b = z5 ? 1 : 2;
        uVar.f36195d = l10.longValue();
        uVar.f36194c = l11.longValue();
        uVar.f36198g = null;
        uVar.f36196e = true;
        uVar.f36197f = 1;
        if (l11.longValue() != 0 && l10.longValue() != 0) {
            if (!z5) {
                l10 = null;
            }
            c(l11, l10);
        }
        a(uVar, null);
    }

    public final void c(Long l10, Long l11) {
        HashMap map = this.f36206c;
        if (l11 != null) {
            if (((Long) map.put(l10, l11)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l10)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d5  */
    @Override // xh.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final android.view.KeyEvent r30, ac.c r31) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.x.d(android.view.KeyEvent, ac.c):void");
    }
}
