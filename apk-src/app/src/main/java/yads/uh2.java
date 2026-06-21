package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uh2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sq1 f43666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediatedAdapterPrefetcher f43667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh2 f43669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ es1 f43670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f43671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e00 f43672h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d03 f43673j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh2(zh2 zh2Var, es1 es1Var, Context context, e00 e00Var, long j10, d03 d03Var, mj.a aVar) {
        super(2, aVar);
        this.f43669e = zh2Var;
        this.f43670f = es1Var;
        this.f43671g = context;
        this.f43672h = e00Var;
        this.i = j10;
        this.f43673j = d03Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new uh2(this.f43669e, this.f43670f, this.f43671g, this.f43672h, this.i, this.f43673j, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uh2) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f43668d;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            ph2 ph2Var = this.f43669e.f45417e;
            es1 es1Var = this.f43670f;
            ph2Var.getClass();
            String str = es1Var.f38250b;
            sq1 sq1Var = new sq1(str, es1Var.f38251c, null, null, null, null, null);
            try {
                zh2.a(this.f43669e, sq1Var);
                this.f43669e.f45415c.a(this.f43671g, sq1Var, com.monetization.ads.mediation.base.a.class);
                kh2 kh2VarA = lq1.a(str);
                this.f43669e.f45413a.a(this.f43671g, this.f43672h, kh2VarA, null);
                return kh2VarA;
            } catch (IllegalArgumentException e3) {
                return lq1.a(sq1Var.f43050b, e3);
            }
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.f43667c;
        sq1 sq1Var2 = this.f43666b;
        try {
            try {
                com.google.android.gms.internal.measurement.h5.E(obj);
                kh2 kh2Var = (kh2) obj;
                mv mvVar = this.f43669e.f45414b;
                mvVar.f41018a.a(mvVar.f41020c, mvVar.f41019b, null);
                Long lA = this.f43669e.f45414b.a();
                if (kh2Var != null) {
                    zh2 zh2Var = this.f43669e;
                    zh2Var.f45413a.a(this.f43671g, this.f43672h, kh2Var, lA);
                }
                mediatedAdapterPrefetcher.onInvalidate();
                return kh2Var;
            } catch (Exception e7) {
                mv mvVar2 = this.f43669e.f45414b;
                mvVar2.f41018a.a(mvVar2.f41020c, mvVar2.f41019b, null);
                Long lA2 = this.f43669e.f45414b.a();
                kh2 kh2VarA2 = lq1.a(sq1Var2.f43050b, e7);
                this.f43669e.f45413a.a(this.f43671g, this.f43672h, kh2VarA2, lA2);
                mediatedAdapterPrefetcher.onInvalidate();
                return kh2VarA2;
            }
        } catch (Throwable th2) {
            mediatedAdapterPrefetcher.onInvalidate();
            throw th2;
        }
    }
}
