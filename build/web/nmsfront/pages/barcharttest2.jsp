<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Health Centre consumption</title>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
$(function () {
    $('#container').highcharts({
        title: {
            text: 'Health Center Drug Distribution ',
            x: -20 //center
        },
        subtitle: {
            text: '',
            x: -20
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: 'Quantity (cartons)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '°C'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: 'Panadol',
            data: [16.0, 18.9, 19.5, 24.5, 27.2, 21.5, 28.2, 26.5, 34.3, 57.3, 47.9, 39.6]
        }, {
            name: 'Ceptrine',
            data: [ 19.2, 28.6, 25.7, 24.3, 26.0, 32.0, 34.8, 38.1, 42.1, 44.1, 48.6, 32.5]
        }, {
            name: 'Test Kits',
            data: [10.3, 10.9,17.7, 13.3, 15.0, 18.0, 22.8, 20.1, 21.1, 17.1, 29.6, 34.5]
        }, {
            name: 'Medical Gloves',
            data: [18.6, 23.5, 25.7, 28.3, 25.0, 37.0, 36.8, 48.1, 32.1, 27.1, 32.6, 37.5]
        },  {
            name: 'Artenum',
            data: [18.6, 23.5, 25.7, 28.3, 25.0, 37.0, 36.8, 48.1, 32.1, 27.1, 32.6, 37.5]
        },	{
            name: 'Coartem',
            data: [15.9, 10.6, 23.5, 28.4, 33.5, 27.0, 28.6, 37.9, 34.3, 39.0, 43.9, 51.0]
        }, {
            name: 'Magnesium',
            data: [13.9, 24.2, 25.7, 28.5, 31.9, 25.2, 27.0, 26.6, 24.2, 20.3, 36.6, 34.8]
        }]
    });
});
		</script>
	</head>
	<body>
<script src="../../js/highcharts.js"></script>
<script src="../../js/modules/exporting.js"></script>

<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

	</body>
</html>
