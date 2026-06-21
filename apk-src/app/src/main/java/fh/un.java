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
public final class un implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18702a;

    public un(sy syVar) {
        this.f18702a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qn resolve(ParsingContext parsingContext, xn xnVar, JSONObject jSONObject) {
        Field field = xnVar.f19033a;
        sy syVar = this.f18702a;
        if (((u6) JsonFieldResolver.resolveOptional(parsingContext, xnVar.f19035c, jSONObject, "action_animation", syVar.f18522s1, syVar.f18503q1)) == null) {
            Expression expression = vn.f18786a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19036d, jSONObject, "actions", syVar.f18464m1, syVar.f18443k1);
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, xnVar.f19037e, jSONObject, "alignment_horizontal", vn.f18791f, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xnVar.f19038f, jSONObject, "alignment_vertical", vn.f18792g, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, xnVar.f19039g, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, vn.i, vn.f18786a);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19040h, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.i, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, xnVar.f19042k, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, vn.f18787b);
        Field field2 = xnVar.f19043l;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper, function1, vn.f18794j);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19045n, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19046o, jSONObject, "doubletap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19047p, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19049r, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, xnVar.f19050s, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = vn.f18788c;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19051t, jSONObject, "hover_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19052u, jSONObject, "hover_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.f19055x, jSONObject, "longtap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.A, jSONObject, "press_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.B, jSONObject, "press_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, xnVar.C, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, xnVar.D, jSONObject, "row_span", typeHelper, function1, vn.f18795k);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.E, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.F, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.K, jSONObject, "transition_triggers", kv.f17646g, vn.f18796l);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.L, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.M, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, xnVar.N, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, vn.f18793h, kv.f17653o, vn.f18789d);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, xnVar.O, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, xnVar.P, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, xnVar.Q, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = vn.f18790e;
        }
        return new qn(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
