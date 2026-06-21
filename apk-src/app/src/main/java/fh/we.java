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
public final class we implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18889a;

    public we(sy syVar) {
        this.f18889a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ne resolve(ParsingContext parsingContext, ze zeVar, JSONObject jSONObject) {
        Field field = zeVar.f19238a;
        sy syVar = this.f18889a;
        if (((u6) JsonFieldResolver.resolveOptional(parsingContext, zeVar.f19242c, jSONObject, "action_animation", syVar.f18522s1, syVar.f18503q1)) == null) {
            Expression expression = xe.f19001a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19244d, jSONObject, "actions", syVar.f18464m1, syVar.f18443k1);
        Field field2 = zeVar.f19245e;
        TypeHelper typeHelper = xe.f19012m;
        v0 v0Var = v0.f18733v;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        Field field3 = zeVar.f19246f;
        TypeHelper typeHelper2 = xe.f19013n;
        v0 v0Var2 = v0.f18734w;
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.f19247g, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, xe.f19019t, xe.f19001a);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19248h, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19250k, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field4 = zeVar.f19252m;
        TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper3, function1, xe.f19002b);
        Field field5 = zeVar.f19253n;
        TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper4, function12, xe.f19020u);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.f19254o, jSONObject, "content_alignment_horizontal", xe.f19014o, v0Var, xe.f19003c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.f19255p, jSONObject, "content_alignment_vertical", xe.f19015p, v0Var2, xe.f19004d);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19256q, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19257r, jSONObject, "doubletap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19258s, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19259t, jSONObject, "filters", syVar.f18455l3, syVar.f18434j3);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19261v, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, zeVar.f19262w, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = xe.f19005e;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.f19263x, jSONObject, "high_priority_preview_show", typeHelper3, function1, xe.f19006f);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19264y, jSONObject, "hover_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19265z, jSONObject, "hover_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveExpression(parsingContext, zeVar.B, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.D, jSONObject, "longtap_actions", syVar.f18464m1, syVar.f18443k1);
        Field field6 = zeVar.G;
        TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "placeholder_color", typeHelper5, function13, xe.f19007g);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.H, jSONObject, "preload_required", typeHelper3, function1, xe.f19008h);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.I, jSONObject, "press_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.J, jSONObject, "press_start_actions", syVar.f18464m1, syVar.f18443k1);
        Field field7 = zeVar.K;
        TypeHelper<String> typeHelper6 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "preview", typeHelper6);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.L, jSONObject, "reuse_id", typeHelper6);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.M, jSONObject, "row_span", typeHelper4, function12, xe.f19021v);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.N, jSONObject, "scale", xe.f19016q, be.f16940z, xe.i);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.O, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.P, jSONObject, "tint_color", typeHelper5, function13);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.Q, jSONObject, "tint_mode", xe.f19017r, v0.C, xe.f19009j);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.R, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.W, jSONObject, "transition_triggers", kv.f17646g, xe.f19022w);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.X, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.Y, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, zeVar.Z, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, xe.f19018s, kv.f17653o, xe.f19010k);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, zeVar.f19239a0, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, zeVar.f19241b0, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, zeVar.f19243c0, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = xe.f19011l;
        }
        return new ne(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
