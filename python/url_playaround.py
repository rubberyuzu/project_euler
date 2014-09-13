import urllib2

def wget(url):
	ufile = urllib2.urlopen(url)
	info = ufile.read()
	print info
	# if info.gettype() == 'text/html':
	# 	print 'base url: ' + ufile.geturl()
	# 	text = ufile.read()
	# 	print text


wget('http://andymori.com')

# response = urllib2.urlopen('http://andymori.com')
# print response
# html = response.read()
# print html