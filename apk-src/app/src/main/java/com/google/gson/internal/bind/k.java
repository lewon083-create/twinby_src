package com.google.gson.internal.bind;

import a0.b1;
import java.io.IOException;
import me.r;
import me.v;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f14973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me.o f14974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.k f14975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.gson.reflect.a f14976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f14977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1 f14978f = new b1(6, this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f14979g;

    public k(v vVar, me.o oVar, me.k kVar, com.google.gson.reflect.a aVar, x xVar) {
        this.f14973a = vVar;
        this.f14974b = oVar;
        this.f14975c = kVar;
        this.f14976d = aVar;
        this.f14977e = xVar;
    }

    public static x c(final com.google.gson.reflect.a aVar, final me.o oVar) {
        final boolean z5 = aVar.getType() == aVar.getRawType();
        return new x(oVar, aVar, z5) { // from class: com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.google.gson.reflect.a f14928b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f14929c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final v f14930d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final me.o f14931e;

            {
                this.f14930d = oVar instanceof v ? (v) oVar : null;
                this.f14931e = oVar;
                this.f14928b = aVar;
                this.f14929c = z5;
            }

            @Override // me.x
            public final w a(me.k kVar, com.google.gson.reflect.a aVar2) {
                com.google.gson.reflect.a aVar3 = this.f14928b;
                if (aVar3 == null) {
                    aVar2.getRawType();
                    throw null;
                }
                if (aVar3.equals(aVar2) || (this.f14929c && aVar3.getType() == aVar2.getRawType())) {
                    return new k(this.f14930d, this.f14931e, kVar, aVar2, this);
                }
                return null;
            }
        };
    }

    @Override // me.w
    public final Object a(re.b bVar) {
        com.google.gson.reflect.a aVar = this.f14976d;
        me.o oVar = this.f14974b;
        if (oVar != null) {
            me.p pVarK = oe.d.k(bVar);
            if (pVarK instanceof r) {
                return null;
            }
            return oVar.deserialize(pVarK, aVar.getType(), this.f14978f);
        }
        w wVarE = this.f14979g;
        if (wVarE == null) {
            wVarE = this.f14975c.e(this.f14977e, aVar);
            this.f14979g = wVarE;
        }
        return wVarE.a(bVar);
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        com.google.gson.reflect.a aVar = this.f14976d;
        v vVar = this.f14973a;
        if (vVar == null) {
            w wVarE = this.f14979g;
            if (wVarE == null) {
                wVarE = this.f14975c.e(this.f14977e, aVar);
                this.f14979g = wVarE;
            }
            wVarE.b(cVar, obj);
            return;
        }
        if (obj == null) {
            cVar.i();
            return;
        }
        me.p pVarSerialize = vVar.serialize(obj, aVar.getType(), this.f14978f);
        p.A.getClass();
        l.d(cVar, pVarSerialize);
    }
}
