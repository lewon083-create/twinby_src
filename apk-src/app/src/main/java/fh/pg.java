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
public final class pg implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18095a;

    public pg(sy syVar) {
        this.f18095a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xf resolve(ParsingContext parsingContext, yg ygVar, JSONObject jSONObject) {
        Field field = ygVar.f19123a;
        sy syVar = this.f18095a;
        Field field2 = ygVar.f19125b;
        TypeHelper typeHelper = qg.f18180q;
        v0 v0Var = v0.f18733v;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        Field field3 = ygVar.f19127c;
        TypeHelper typeHelper2 = qg.f18181r;
        v0 v0Var2 = v0.f18734w;
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        Field field4 = ygVar.f19129d;
        TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper3, function1, qg.A, qg.f18165a);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19131e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19133f, jSONObject, "autocapitalization", qg.f18182s, be.F, qg.f18166b);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19135g, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field5 = ygVar.i;
        TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper4, function12, qg.B);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19138j, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19139k, jSONObject, "enter_key_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19140l, jSONObject, "enter_key_type", qg.f18183t, be.G, qg.f18167c);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19141m, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19142n, jSONObject, "filters", syVar.f18505q4, syVar.f18485o4);
        Field field6 = ygVar.f19144p;
        TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "font_family", typeHelper5);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19145q, jSONObject, "font_size", typeHelper4, function12, qg.C, qg.f18168d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19146r, jSONObject, "font_size_unit", qg.f18184u, hn.f17349o, qg.f18169e);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19147s, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19148t, jSONObject, "font_weight", qg.f18185v, w9.f18848w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19149u, jSONObject, "font_weight_value", typeHelper4, function12, qg.D);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19150v, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, ygVar.f19151w, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = qg.f18170f;
        }
        lo loVar2 = loVar;
        Field field7 = ygVar.f19152x;
        TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "highlight_color", typeHelper6, function13);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19153y, jSONObject, "hint_color", typeHelper6, function13, qg.f18171g);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19154z, jSONObject, "hint_text", typeHelper5);
        Field field8 = ygVar.B;
        TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "is_enabled", typeHelper7, function14, qg.f18172h);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.C, jSONObject, "keyboard_type", qg.f18186w, be.H, qg.i);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.E, jSONObject, "letter_spacing", typeHelper3, function1, qg.f18173j);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.F, jSONObject, "line_height", typeHelper4, function12, qg.E);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.I, jSONObject, "max_length", typeHelper4, function12, qg.F);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.J, jSONObject, "max_visible_lines", typeHelper4, function12, qg.G);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.M, jSONObject, "reuse_id", typeHelper5);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.N, jSONObject, "row_span", typeHelper4, function12, qg.H);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.O, jSONObject, "select_all_on_focus", typeHelper7, function14, qg.f18174k);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.P, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.Q, jSONObject, "text_alignment_horizontal", qg.f18187x, v0Var, qg.f18175l);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.R, jSONObject, "text_alignment_vertical", qg.f18188y, v0Var2, qg.f18176m);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.S, jSONObject, "text_color", typeHelper6, function13, qg.f18177n);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.U, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.Z, jSONObject, "transition_triggers", kv.f17646g, qg.I);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19124a0, jSONObject, "validators", syVar.C4, syVar.A4);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19126b0, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19128c0, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ygVar.f19130d0, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, qg.f18189z, kv.f17653o, qg.f18178o);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, ygVar.f19132e0, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, ygVar.f19134f0, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, ygVar.f19136g0, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = qg.f18179p;
        }
        return new xf(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
