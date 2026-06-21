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
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kn implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17607a;

    public kn(sy syVar) {
        this.f17607a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gn resolve(ParsingContext parsingContext, nn nnVar, JSONObject jSONObject) {
        Field field = nnVar.f17976a;
        sy syVar = this.f17607a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17977b, jSONObject, "alignment_horizontal", ln.f17731j, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17978c, jSONObject, "alignment_vertical", ln.f17732k, v0.f18734w);
        Field field2 = nnVar.f17979d;
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper, function1, ln.f17736o, ln.f17723a);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.f17980e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.f17981f, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field3 = nnVar.f17983h;
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, function12, ln.f17737p);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.i, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.f17984j, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        Field field4 = nnVar.f17986l;
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_family", typeHelper3);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17987m, jSONObject, "font_size", typeHelper2, function12, ln.f17738q, ln.f17724b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17988n, jSONObject, "font_size_unit", ln.f17733l, hn.f17349o, ln.f17725c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17989o, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17990p, jSONObject, "font_weight", ln.f17734m, w9.f18848w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17991q, jSONObject, "font_weight_value", typeHelper2, function12, ln.f17739r);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.f17992r, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, nnVar.f17993s, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = ln.f17726d;
        }
        lo loVar2 = loVar;
        Field field5 = nnVar.f17994t;
        TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "hint_color", typeHelper4, function13, ln.f17727e);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17995u, jSONObject, "hint_text", typeHelper3);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17998x, jSONObject, "letter_spacing", typeHelper, function1, ln.f17728f);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.f17999y, jSONObject, "line_height", typeHelper2, function12, ln.f17740s);
        JsonFieldResolver.resolveList(parsingContext, nnVar.A, jSONObject, RRWebOptionsEvent.EVENT_TAG, syVar.A6, syVar.f18588y6, ln.f17741t);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.C, jSONObject, "reuse_id", typeHelper3);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.D, jSONObject, "row_span", typeHelper2, function12, ln.f17742u);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.E, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.F, jSONObject, "text_color", typeHelper4, function13, ln.f17729g);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.G, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.L, jSONObject, "transition_triggers", kv.f17646g, ln.f17743v);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.N, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.O, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, nnVar.P, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, ln.f17735n, kv.f17653o, ln.f17730h);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, nnVar.Q, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, nnVar.R, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, nnVar.S, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = ln.i;
        }
        return new gn(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
