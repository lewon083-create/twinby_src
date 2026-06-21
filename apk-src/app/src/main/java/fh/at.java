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
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class at implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16876a;

    public at(sy syVar) {
        this.f16876a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ps resolve(ParsingContext parsingContext, ju juVar, JSONObject jSONObject) {
        Field field = juVar.f17507a;
        sy syVar = this.f16876a;
        if (((u6) JsonFieldResolver.resolveOptional(parsingContext, juVar.f17511c, jSONObject, "action_animation", syVar.f18522s1, syVar.f18503q1)) == null) {
            Expression expression = bt.f16956a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17513d, jSONObject, "actions", syVar.f18464m1, syVar.f18443k1);
        Field field2 = juVar.f17515e;
        TypeHelper typeHelper = bt.f16971q;
        v0 v0Var = v0.f18733v;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        Field field3 = juVar.f17517f;
        TypeHelper typeHelper2 = bt.f16972r;
        v0 v0Var2 = v0.f18734w;
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        Field field4 = juVar.f17519g;
        TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper3, function1, bt.A, bt.f16956a);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17521h, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        Field field5 = juVar.i;
        TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "auto_ellipsize", typeHelper4, function12);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17523j, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17527l, jSONObject, "capture_focus_on_action", typeHelper4, function12, bt.f16957b);
        Field field6 = juVar.f17529m;
        TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, function13, bt.B);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17531n, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17533o, jSONObject, "doubletap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17536q, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        Field field7 = juVar.f17539s;
        TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "focused_text_color", typeHelper6, function14);
        Field field8 = juVar.f17540t;
        TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_family", typeHelper7);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17541u, jSONObject, "font_feature_settings", typeHelper7);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17542v, jSONObject, "font_size", typeHelper5, function13, bt.C, bt.f16958c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17543w, jSONObject, "font_size_unit", bt.f16973s, hn.f17349o, bt.f16959d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17544x, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17545y, jSONObject, "font_weight", bt.f16974t, w9.f18848w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17546z, jSONObject, "font_weight_value", typeHelper5, function13, bt.D);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.A, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, juVar.B, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = bt.f16960e;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.C, jSONObject, "hover_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.D, jSONObject, "hover_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.F, jSONObject, DebugMeta.JsonKeys.IMAGES, syVar.f18558v8, syVar.f18540t8);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.H, jSONObject, "letter_spacing", typeHelper3, function1, bt.f16961f);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.I, jSONObject, "line_height", typeHelper5, function13, bt.E);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.J, jSONObject, "longtap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.L, jSONObject, "max_lines", typeHelper5, function13, bt.F);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.M, jSONObject, "min_hidden_lines", typeHelper5, function13, bt.G);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.O, jSONObject, "press_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.P, jSONObject, "press_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.Q, jSONObject, "ranges", syVar.f18529s8, syVar.f18508q8);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.R, jSONObject, "reuse_id", typeHelper7);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.S, jSONObject, "row_span", typeHelper5, function13, bt.H);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.T, jSONObject, "selectable", typeHelper4, function12, bt.f16962g);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.U, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        Field field9 = juVar.V;
        TypeHelper typeHelper8 = bt.f16975u;
        mg mgVar = mg.f17856o;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "strike", typeHelper8, mgVar, bt.f16963h);
        JsonFieldResolver.resolveExpression(parsingContext, juVar.W, jSONObject, "text", typeHelper7);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.X, jSONObject, "text_alignment_horizontal", bt.f16976v, v0Var, bt.i);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.Y, jSONObject, "text_alignment_vertical", bt.f16977w, v0Var2, bt.f16964j);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.Z, jSONObject, "text_color", typeHelper6, function14, bt.f16965k);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17512c0, jSONObject, "tighten_width", typeHelper4, function12, bt.f16966l);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17514d0, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17522i0, jSONObject, "transition_triggers", kv.f17646g, bt.I);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17524j0, jSONObject, "truncate", bt.f16978x, kr.f17619n, bt.f16967m);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17526k0, jSONObject, "underline", bt.f16979y, mgVar, bt.f16968n);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17528l0, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17530m0, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, juVar.f17532n0, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, bt.f16980z, kv.f17653o, bt.f16969o);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, juVar.o0, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, juVar.f17535p0, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, juVar.f17537q0, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = bt.f16970p;
        }
        return new ps(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
