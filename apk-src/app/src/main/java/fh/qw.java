package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qw implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18203a;

    public qw(sy syVar) {
        this.f18203a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nw resolve(ParsingContext parsingContext, ww wwVar, JSONObject jSONObject) {
        Field field = wwVar.f18935a;
        sy syVar = this.f18203a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.f18936b, jSONObject, "alignment_horizontal", rw.f18275j, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.f18937c, jSONObject, "alignment_vertical", rw.f18276k, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.f18938d, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, rw.f18279n, rw.f18267a);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18939e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        Field field2 = wwVar.f18941g;
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "autostart", typeHelper, function1, rw.f18268b);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18942h, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18943j, jSONObject, "buffering_actions", syVar.f18464m1, syVar.f18443k1);
        Field field3 = wwVar.f18944k;
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, function12, rw.f18280o);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18945l, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18947n, jSONObject, "end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18948o, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18949p, jSONObject, "fatal_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18951r, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, wwVar.f18952s, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = rw.f18269c;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.f18956w, jSONObject, "muted", typeHelper, function1, rw.f18270d);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.f18958y, jSONObject, "pause_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.A, jSONObject, "preload_required", typeHelper, function1, rw.f18271e);
        Field field4 = wwVar.B;
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "preview", typeHelper3);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.C, jSONObject, "repeatable", typeHelper, function1, rw.f18272f);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.D, jSONObject, "resume_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.E, jSONObject, "reuse_id", typeHelper3);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.F, jSONObject, "row_span", typeHelper2, function12, rw.f18281p);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.G, jSONObject, "scale", rw.f18277l, kv.f17652n, rw.f18273g);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.H, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.I, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.N, jSONObject, "transition_triggers", kv.f17646g, rw.f18282q);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.O, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.P, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveList(parsingContext, wwVar.Q, jSONObject, "video_sources", syVar.f18396f9, syVar.f18374d9, rw.f18283r);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wwVar.R, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, rw.f18278m, kv.f17653o, rw.f18274h);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, wwVar.S, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, wwVar.T, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, wwVar.U, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = rw.i;
        }
        return new nw(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
